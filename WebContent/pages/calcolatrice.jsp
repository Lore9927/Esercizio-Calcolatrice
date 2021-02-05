<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calcolatrice</title>
	</head>
	<body>
		<h1>Calcolatrice</h1>
		<form>
			<table>
				<tr>
					<td>
						Inserisci il primo numero
					</td>
					<td>
						<input type="number" name="primoNumero" required step="0.01">
					</td>
				</tr>
				<tr>
					<td>
						Inserisci il secondo numero
					</td>
					<td>
						<input type="number" name="secondoNumero" required step="0.01">
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: center;">
						<button type="submit" formaction="/esercizio-calcolatrice/SommaServlet" name="somma">+</button> 
						<button type="submit" formaction="/esercizio-calcolatrice/SottrServlet" name="sottrazione">-</button> 
						<button type="submit" formaction="/esercizio-calcolatrice/MoltipServlet" name="moltiplicazione">x</button>
						<button type="submit" formaction="/esercizio-calcolatrice/DivisioneServlet" name="divisione">:</button>
					</td>
				</tr>
			</table>
		</form>
		<p>Risultato:${risultato}</p>
	</body>
</html>