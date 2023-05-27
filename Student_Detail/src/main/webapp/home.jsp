<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        form {
            max-width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        input[type="text"], button {
            display: block;
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        button {
            background-color: #008CBA;
            color: white;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Add Student</h1><br>
    <form action="addStudent">
        <input type="text" name="studentName" placeholder="Student name"><br>
        <input type="text" name="studentMarks" placeholder="Student Marks"><br>
        <input type="submit"><br>
    </form>

    <form action="find.jsp">
        <button>find by id</button>
    </form>
</body>
</html>