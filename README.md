## 1. JSON Web Token (JWT)
- "JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA"

3 đặc điểm chính:

- **Compact and self-contained**: Một đặc điểm và cũng là lợi điểm của JWT nếu đem so sánh với SWT (Simple Web Tokens) hay SAML (Security Assertion Markup Language Tokens) chính là sự gọn nhẹ và độc lập trong việc đóng gói và truyền tải thông tin.

- **JSON object**: JSON (JavaScript Object Notation) là một kiểu cấu trúc dữ liệu được xây dựng theo các cặp key - value. Bản chất của JWT cũng là một chuỗi của các JSON object được mã hóa.

- **Signed using a secret or public/private key pair**: Đã là token thì tất nhiên phải được bảo mật và đối với JWT thì chúng ta có hai phương pháp ký để đảm bảo tính toàn vẹn cũng như bảo mật của dữ liệu đó là sử dụng secret key (ký bằng thuật toán HMAC) hoặc sử dụng public/private key (ký bằng thuật toán RSA hoặc ECDSA)

Một chuỗi JWT sẽ bao gồm 3 phần phân cách nhau bởi dấu chấm (.)

```json
[Header].[Payload].[Signature]
```
- Header

Thông thường header sẽ bao gồm 2 phần: Loại token và thuật toán dùng để ký

Trong đó loại token ở trường hợp này là JWT còn thuật toán ví dụ như HMAC SHA256 hoặc RSA

- Payload

Phần thứ hai của JWT là payload chứa thông tin (claims) về đối tượng truy cập hệ thống (user) và các thông tin được bổ sung thêm. Có 3 loại thông tin có thể được đính trong phần payload:

Registered claims: Là những trường thông tin được định nghĩa sẵn tuy không bắt buộc nhưng được khuyến khích sử dụng ví dụ như: iss `(issuer)`, exp `(expiration time)`, sub `(subject)`, aud `(audience)`...

- Signature

Để tạo ra được signature chúng ta sẽ phải có: **base64Url encoded header**, **base64Url encoded payload**, **secret key**, **sign algorithm**