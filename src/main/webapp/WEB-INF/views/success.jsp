<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Hello ${login.username}</h2>
  <p></p>            
  <table class="table">
    <thead>
      <tr>
        <th>UserName</th>
        <th>PassWord</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${login.username}</td>
        <td>${login.password}</td>
        <td>john@example.com</td>
      </tr>
    
    </tbody>
  </table>
</div>

</body>
</html>
