<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome To MyPage</title>
</head>
<body>
    <form action="addUser">
        Enter Name :<input type="text" name="name"><br>
        Enter Email :<input type="email" name="email"><br>
        Enter Password :<input type="password" name="password"><br>
        Enter Confirm Password :<input type="password" name="cnfpassword"><br>
        <input type="submit">
    </form>


    <h2>Display Information</h2>
    <form action="getUser">
      
        Enter Email :<input type="email" name="email"><br>
    
        <input type="submit">
    </form>

    <h2>Delete User Details</h2>
    <form action="deleteUser">
      
        Enter Email :<input type="email" name="email"><br>
    
        <input type="submit">
    </form>

</form>

<h2>Update User Details</h2>
<form action="updateUser">
  
    Enter Email :<input type="email" name="email"><br>

    <input type="submit">
</form>
</body>
</html>