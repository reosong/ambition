<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>영신사 스토어 </title>
    <style>
        a:link{text-decoration: none;color: black;}
        a:visited{text-decoration: none;color: black;}
        a:active{text-decoration: none;color: black;}
        a:hover{text-decoration: none;color: black;}
            
        </style>
<link rel="stylesheet" href="css/product.css">
<link rel="stylesheet" href="css/costomer.css">
</head>
<body>

<jsp:include page ="h.jsp"/>

<jsp:include page ="side.jsp"/>

<!-- 메 -->
    <main>
        <h1 id="title">고객 센터</h1>
      	<form action="writeAction.jsp" method ="post">
        <div id="list">
            <table>
            <thead class="table_list">
                <tr>
                    <th class="thead_th_long">글 작성 </th>
                </tr>
            </thead>


            <tbody>
                
                <tr>
                    <th class="text_th"> <input type="text" name="dataTitle"class="text_small" placeholder="글 제목을 입력해주세요 ">  </th>
                </tr>
                <tr>
                    <th class="textarea_th"> <textarea name="dataContent"class="text_big" > </textarea> </th>
                </tr>
            </tbody>
            </table>
        </div>
        <div>
           <input type="submit" value="제출" id="button_gray">
        </div>

    </form>

    </main>