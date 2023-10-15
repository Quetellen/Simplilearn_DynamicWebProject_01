package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Batch;
import model.BatchDAO;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BatchDAO batchDAO = new BatchDAO();
	Batch batch = new Batch();

	// ParticipantDAO participantDAO = new ParticipantDAO();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			batches(request, response);
		} else if (action.equals("/insert")) {
			newBatches(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	// Listar Batches
	protected void batches(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Criando um objeto que ira receber os dados Batches
		ArrayList<Batch> list = batchDAO.listbatches();
		//teste de recebimento
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getB_id());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getStartTime());
			System.out.println(list.get(i).getEndTime());
			System.out.println(list.get(i).getShift());
		}

		// test de conexao
		// batchDAO.connectionTest();

	}

	// New Batch
	protected void newBatches(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * // Teste de recebimento System.out.println(request.getParameter("name"));
		 * System.out.println(request.getParameter("startTime"));
		 * System.out.println(request.getParameter("endTime"));
		 * System.out.println(request.getParameter("shift"));
		 */
		// setar as variaveis batch
		batch.setName(request.getParameter("name"));
		batch.setStartTime(request.getParameter("startTime"));
		batch.setEndTime(request.getParameter("endTime"));
		batch.setShift(request.getParameter("shift")); // invocar o metodo insertBatch
		// passando o objeto batch
		batchDAO.insertNewBatch(batch); // <-
		// redirecionar para odocument
		response.sendRedirect("main");

	}

}
