package dim.jolim.view.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
	private CursoDao cursoDao;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Curso curso = new Curso();
		String nome = req.getParameter("nome");
		String strDtInicio = req.getParameter("dataInicio"); 
		String strDtFim = req.getParameter("dataFim");

		String paginaDestino = "/detalhesCurso.jsp";
		String mensagem = "";
		try {
			curso.setNome(nome);
			curso.setDataInicio(sdf.parse(strDtInicio));
			curso.setDataFim(sdf.parse(strDtFim));
			curso = cursoDao.salvar(curso);
			req.setAttribute("curso", curso);
			mensagem = "Curso salvo com Sucesso!";
		} catch (ParseException e) {
			mensagem = "Erro: "+e.getMessage();
			paginaDestino = "/cadastrarCurso.jsp";
		}
		
		req.setAttribute("mensagem", mensagem);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		String paginaDestino = "/listaCursos.jsp";
		String mensagem = "";
		if (id == null || id.isEmpty()) {
			List<Curso> cursos = cursoDao.listarTodosCursos();
			req.setAttribute("cursos", cursos);
		} else {
			Curso curso = cursoDao.buscarPorId(Integer.valueOf(id));
			req.setAttribute("curso", curso);				
			paginaDestino = "/detalhesCurso.jsp";
		}
		
		req.setAttribute("mensagem", mensagem);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(req, resp);
		
	}
}
