<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container mt-3">
  <h2>건강검진 수정</h2>
  <form action="#" class ="col-3">
    <div class="mb-3 mt-3">
      <label for="email">검진번호:</label>
      <input type="number" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="mb-3">
      <label for="pwd">검진일:</label>
      <input type="date" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="mb-3">
      <label for="pwd">몸무게:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="mb-3">
      <label for="pwd">키:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="mb-3">
      <label for="pwd">혈당수치:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="mb-3">
      <label for="pwd">직원번호:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>