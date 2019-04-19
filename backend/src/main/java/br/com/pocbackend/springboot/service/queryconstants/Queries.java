package br.com.pocbackend.springboot.service.queryconstants;

public interface Queries {
	
	
	String LIST_ALUNOS =" SELECT * FROM ALUNO";
	String LIST_ALUNOS_BY_ID =" SELECT * FROM ALUNO WHERE ID_ALUNO = ?";
	String LIST_ALUNOS_BY_EMAIL =" SELECT * FROM ALUNO AL INNER JOIN USUARIO USU ON AL.ID_USUARIO = USU.ID_USUARIO LEFT OUTER JOIN MATRICULA MAT ON MAT.ID_ALUNO = AL.ID_ALUNO WHERE USU.EMAIL = ?";
	String INSERT_ALUNO="INSERT INTO ALUNO(NOME, CPF, ENDERECO, ESTADO, MUNICIPIO, TELEFONE, ID_USUARIO) VALUES (?, ?, ?, ?, ?, ?, ?)";
	String UPDATE_ALUNO="UPDATE ALUNO set NOME = ?, CPF = ?, ENDERECO = ?, ESTADO = ?, MUNICIPIO = ?, TELEFONE = ? WHERE ID_ALUNO = ?";
	String DElETE_ALUNO="DELETE FROM ALUNO WHERE ID_ALUNO= ?";
	
	
	String LIST_USUARIOS =" SELECT * FROM USUARIO";
	String LIST_USUARIO_BY_ID =" SELECT * FROM USUARIO WHERE ID_USUARIO = ?";
	String LIST_USUARIO_BY_EMAIL =" SELECT * FROM USUARIO USU LEFT OUTER JOIN ALUNO AL ON AL.ID_USUARIO = USU.ID_USUARIO LEFT OUTER JOIN MATRICULA MAT ON MAT.ID_ALUNO = AL.ID_ALUNO  WHERE EMAIL = ?";
	String INSERT_USUARIO="INSERT INTO USUARIO(EMAIL, SENHA, PERFIL) VALUES (?, ?, ?)";
	String UPDATE_USUARIO="UPDATE USUARIO set EMAIL = ?, SENHA = ?, PERFIL = ? WHERE ID_USUARIO = ?";
	String DElETE_USUARIO="DELETE FROM USUARIO WHERE EMAIL= ?";
	
	
	String LIST_MATRICULAS =" SELECT * FROM MATRICULA MA INNER JOIN ALUNO AL ON AL.ID_ALUNO =  MA.ID_ALUNO INNER JOIN CURSO CUR ON CUR.ID_CURSO = MA.ID_CURSO";
	String LIST_MATRICULA_BY_ID =" SELECT * FROM MATRICULA MA INNER JOIN ALUNO AL ON AL.ID_ALUNO =  MA.ID_ALUNO INNER JOIN CURSO CUR ON CUR.ID_CURSO = MA.ID_CURSO WHERE MA.ID_MATRICULA = ?";
	String LIST_MATRICULA_BY_ID_CURSO =" SELECT * FROM MATRICULA MA INNER JOIN ALUNO AL ON AL.ID_ALUNO =  MA.ID_ALUNO INNER JOIN CURSO CUR ON CUR.ID_CURSO = MA.ID_CURSO WHERE CUR.ID_CURSO = ?";

	String INSERT_MATRICULA="INSERT INTO MATRICULA(DATA_MATRICULA, ID_ALUNO, ID_CURSO) VALUES (?, ?, ?)";
	
	
	String LIST_CURSOS =" SELECT * FROM CURSO";
	String LIST_CURSO_BY_ID =" SELECT * FROM CURSO WHERE ID_CURSO = ?";
	String LIST_CURSO_BY_CODIGO =" SELECT * FROM CURSO WHERE CODIGO_CURSO = ?";
	String INSERT_CURSO="INSERT INTO CURSO(CODIGO_CURSO, NOME, ANO_SEMESTRE) VALUES (?, ?, ?)";
	String UPDATE_CURSO="UPDATE CURSO set CODIGO_CURSO = ?, NOME = ?, ANO_SEMESTRE = ? WHERE ID_CURSO = ?";
	String DElETE_CURSO="DELETE FROM CURSO WHERE ID_CURSO= ?";
	
	String LIST_AVALIACOES =" SELECT * FROM AVALIACAO";
	String LIST_AVALIACAO_BY_ID =" SELECT * FROM AVALIACAO AVA LEFT OUTER JOIN NOTA NTA ON NTA.ID_AVALIACAO = AVA.ID_AVALIACAO WHERE ID_AVALIACAO = ?";
	String LIST_AVALIACAO_BY_ID_CURSO =" SELECT * FROM AVALIACAO WHERE ID_CURSO = ?";
	String INSERT_AVALIACAO="INSERT INTO AVALIACAO(NOME_AVALIACAO, DATA_AVALIACAO, ID_CURSO) VALUES (?, ?, ?)";
	String UPDATE_AVALIACAO="UPDATE AVALIACAO set NOME_AVALIACAO = ?, DATA_AVALIACAO = ?, ID_CURSO = ? WHERE ID_AVALIACAO = ?";
	String DElETE_AVALIACAO="DELETE FROM AVALIACAO WHERE ID_AVALIACAO= ?";
	
	String LIST_NOTAS ="SELECT * FROM NOTA NT INNER JOIN AVALIACAO AVA ON AVA.ID_AVALIACAO = NT.ID_AVALIACAO INNER JOIN CURSO CUR ON CUR.ID_CURSO = AVA.ID_CURSO \n" + 
			"INNER JOIN MATRICULA MAT ON MAT.ID_CURSO = CUR.ID_CURSO INNER JOIN ALUNO AL ON AL.ID_ALUNO = MAT.ID_ALUNO";
	String LIST_NOTAS_POR_MATRICULA ="SELECT * FROM NOTA NT INNER JOIN AVALIACAO AVA ON AVA.ID_AVALIACAO = NT.ID_AVALIACAO INNER JOIN CURSO CUR ON CUR.ID_CURSO = AVA.ID_CURSO \n" + 
			"INNER JOIN MATRICULA MAT ON MAT.ID_CURSO = CUR.ID_CURSO INNER JOIN ALUNO AL ON AL.ID_ALUNO = MAT.ID_ALUNO WHERE MAT.ID_MATRICULA = ?";
	String LIST_NOTA_BY_ID =" SELECT * FROM NOTA NT INNER JOIN AVALIACAO AVA ON AVA.ID_AVALIACAO = NT.ID_AVALIACAO WHERE NT.ID_NOTA = ?";
	String LIST_NOTA_BY_ID_MATRICULA =" SELECT * FROM NOTA NT INNER JOIN MATRICULA MAT ON MAT.ID_MATRICULA = NT.ID_MATRICULA WHERE NT.ID_MATRICULA = ?";
	String INSERT_NOTA="INSERT INTO NOTA(NOTA, ID_CURSO, ID_AVALIACAO, ID_MATRICULA) VALUES (?, ?, ?, ?)";
	String UPDATE_NOTA="UPDATE NOTA set NOTA = ?, ID_CURSO = ?, ID_AVALIACAO = ?, ID_MATRICULA = ?  WHERE ID_NOTA = ? ";
	String DElETE_NOTA="DELETE FROM NOTA WHERE ID_NOTA= ?";


}
