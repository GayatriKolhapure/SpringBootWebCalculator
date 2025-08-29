<%@page language="java" %>

<html>

<head>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>

 <h2>Add Two Numbers</h2>

  <form id="addForm" class="card" action="add">
    <label for="a">First number</label>
    <input type="number" id="a" placeholder="e.g., 12" name="num1" required />

    <label for="b">Second number</label>
    <input type="number" id="b" placeholder="e.g., 8" name="num2" required />

    <button class="primary" id="addBtn">Add</button>
    <div id="msg" class="result"></div>
  </form>
  </body>
  <html>
