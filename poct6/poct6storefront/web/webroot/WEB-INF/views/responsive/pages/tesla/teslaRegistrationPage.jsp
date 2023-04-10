<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>

<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>



<template:page pageTitle="${pageTitle}">

 <cms:pageSlot position="teslaParagraph" var="feature" class="teslaBannerParagraph">



 </cms:pageSlot>

<head>
   
    <script type="text/javascript">
        window.onload = function() {
            var currentDate = new Date().toISOString().split('T')[0];
            document.getElementById('dateField').min = currentDate;
        };
    </script>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: #333;
        }
        form {
            max-width: 400px;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="date"],
        input[type="submit"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border-radius: 4px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        input[type="date"] {
            background-color: #fff;
            color: #333;
        }
        select {
            height: 36px;
        }
    </style>
</head>

    <h1>Test Drive Registration</h1>
    <form action="/tesla/teslaRegistrationSuccessPage" method="post">
        <label>Email:</label>
        <input type="email" name="email" /><br>
        <label>First Name:</label>
        <input type="text" name="firstName" /><br>
        <label>Last Name:</label>
        <input type="text" name="lastName" /><br>
        <label>Mobile No:</label>
        <input type="text" name="mobileNo" /><br>
        <label>Model Type:</label>
        <select id="modelType" name="modelType" required>
            <option value="Model S">Model S</option>
            <option value="Model 3">Model 3</option>
            <option value="Model X">Model X</option>
            <option value="Model Y">Model Y</option>
        </select><br>
        <label>Date:</label>
        <input type="date" name="date" /><br>
        
        <label for="timeSlot">Time Slot:</label>
        <select id="timeSlot" name="timeSlot" required>
            <option value="Morning">Morning</option>
            <option value="Afternoon">Afternoon</option>
            <option value="Evening">Evening</option>
        </select><br>
        <label for="metroCity">Metro City:</label>
        <select id="metroCity" name="metroCity" required>
            <option value="BENGALURU">BENGALURU</option>
            <option value="CHENNAI">CHENNAI</option>
            <option value="MUMBAI">MUMBAI</option>
            <option value="DELHI">DELHI</option>
        </select><br>

        <label for="teslaDealer">Tesla Dealer:</label>
        <select id="teslaDealer" name="teslaDealer" required>
            <option value="A">A</option>
            <option value="B">B</option>
            <option value="C">C</option>
            <option value="D">D</option>
        </select><br>
        <input type="submit" value="Submit" />
    </form>




</template:page>