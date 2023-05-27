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

        form {
            max-width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        input[type="text"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"], button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #008CBA;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <form action="findStd">
        <input type="text" name="studentId" placeholder="Enter Id"><br>
        <input type="submit"><br>
    </form>
    <h1>${msg}</h1><br>
    <form action="home.jsp">
        <button>Back To Main</button>
    </form>
    


</body>
</html>