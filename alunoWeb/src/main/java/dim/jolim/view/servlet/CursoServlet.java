package dim.jolim.view.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dim.jolim.model.Curso;
import dim.jolim.model.dao.CursoDao;

@WebServlet("/curso")
public class CursoServlet extends HttpServlet {

	@Inject
	private CursoDao cursoRepository;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Curso curso = new Curso();
		String nome = req.getParameter("nome");
		String strDtInicio = req.getParameter("dataInicio"); 
		String strDtFim = req.getParameter("dataFim");

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/detalhesCurso.jsp");
		String mensagem = "";
		try {
			curso.setNome(nome);
			curso.setDataInicio(sdf.parse(strDtInicio));
			curso.setDataFim(sdf.parse(strDtFim));
			curso = cursoRepository.salvar(curso);
			req.setAttribute("curso", curso);
			mensagem = "Curso salvo com Sucesso!";
		} catch (ParseException e) {
			mensagem = "Erro: "+e.getMessage();
			dispatcher = getServletContext().getRequestDispatcher("/cadastrarCurso.jsp");
		}
		
		req.setAttribute("mensagem", mensagem);
		dispatcher.forward(req, resp);
	}
}
