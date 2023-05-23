<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>

<title>등록</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  
</head>
<body>

<div class="container mt-3">
  <h2>등록</h2>
  <form action="insert" method = "post" class = "col-3">
    <div class="mb-3 mt-3">
      <label for="banum">고객번호:</label>
      <input type="text" class="form-control" id="banum" placeholder="고객번호" name="banum">
    </div>
    <div class="mb-3">
      <label for="baname">고객명:</label>
      <input type="text" class="form-control" id="baname" placeholder="고객명" name="baname">
    </div>
    <div class="mb-3">
      <label for="baitem">저축상품:</label>
      <input type="text" class="form-control" id="baitem" name="baitem">
    </div>
     <div class="mb-3">
      <label for="bamoney">납입액:</label>
      <input type="text" class="form-control" id="bamoney" name="bamoney">
    </div>
     <div class="mb-3">
      <label for="badate">가입일:</label>
      <input type="date" class="form-control" id="badate" name="badate">
    </div>
      <div class="mb-3">
      <label for="bamon">저축기간(월):</label>
      <input type="text" class="form-control" id="bamon" name="bamon">
    </div>

    <button type="submit" class="btn btn-primary">등록</button>
    <button type="reset" class="btn btn-primary">새로고침</button>
  </form>
</div>

</body>
</html>