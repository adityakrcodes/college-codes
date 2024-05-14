function validate(){
    var name = document.getElementById("name").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirm-password").value;
    var phone = document.getElementById("phone").value;

    if (name == "" || name == null) {
        alert("Name must be filled out");
        return false;
    }
    if (phone == "" || phone == null) {
        alert("Phone must be filled out");
        return false;
    }
    if (phone.length < 10) {
        alert("Phone must be at least 10 characters long");
        return false;
    }
    if (password == "" || password == null) {
        alert("Password must be filled out");
        return false;
    }
    if (password.length < 6) {
        alert("Password must be at least 8 characters long");
        return false;
    }
    if (confirmPassword == "" || confirmPassword == null) {
        alert("Confirm Password must be filled out");
        return false;
    }
    if (password != confirmPassword) {
        alert("Password and Confirm Password must be same");
        return false;
    }
    document.getElementById("error").innerHTML = "You have successfully registered!";
}