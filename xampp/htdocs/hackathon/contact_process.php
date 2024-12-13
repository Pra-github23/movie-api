<?php
// Include the database connection file
include 'connect.php';

// Check if the form is submitted
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Get form data and sanitize it to avoid security issues
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);
    $message = htmlspecialchars($_POST['message']);
    
    // Validate the data (optional but recommended)
    if (empty($name) || empty($email) || empty($message)) {
        echo "All fields are required.";
        exit;
    }

    // Prepare the SQL statement to insert data into the database
    $stmt = $conn->prepare("INSERT INTO contact_form (name, email, message) VALUES (?, ?, ?)");

    // Bind the parameters (s = string)
    $stmt->bind_param("sss", $name, $email, $message);
    
    // Execute the statement with the form data
    if ($stmt->execute()) {
        echo "Thank you for contacting us! We will get back to you soon.";
        header('Refresh: 5; URL=index.php');  // Redirect to the homepage or any other page
        exit;
    } else {
        echo "There was an error while submitting your message. Please try again later.";
        header('Refresh: 5; URL=index.php');  // Redirect to the homepage or any other page
        exit;
    }
}
?>
