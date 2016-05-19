<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Promocao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Promo��es</title>
<link href="CSS/CadastroPromocao.css" style="text" rel="stylesheet">
<link href="CSS/botao.css" style="text" rel="stylesheet">
</head>
<body>
	<%@ include file="../HTML/cabecalho.html"%>
	<%
		Promocao promocao = (Promocao) request.getAttribute("promocao");
	%>
	<form method='post' action="cadastroPromocaoServlet">
		<input type="hidden" name="id" value="<%=promocao == null ?"" : promocao.getId()%>" />
			
		<div class="cadastro_Promocao">
			<h2>Novo Promo��o</h2>
			
			<table width="100%" border="0" cellpadding="2" cellspacing="5">
 				<tbody>
    				<tr>
      					<td width="50%" align="right">Nome:</td>
      					<td width="50%" align=""><input type="text" name="nome" value="<%=promocao == null ? "" : promocao.getDescricao()%>"></td>
    				</tr>
    				<tr>
    					<td align="right">Desconto (%):</td>
      					<td><input type="text" name="desconto" value="<%=promocao == null ? "" : promocao.getDesconto()%>"></td>
    				</tr>
    				<tr>
    					<td align="right"><input type="submit" value="Salvar" target="_self" class="btn"></td>
    					<td><a href="listarPromocaoServlet" target="_self" class="btn">Voltar</a></td>
    				</tr>
  				</tbody>
			</table>
		</div>
	
	</form>
			<%@ include file="../HTML/rodape.html"%>
</body>
</html>