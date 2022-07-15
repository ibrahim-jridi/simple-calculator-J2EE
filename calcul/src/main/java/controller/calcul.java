package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.calculImp;
import metier.calculMetier;

/**
 * Servlet implementation class calcul
 */
@WebServlet("/calcul")
public class calcul extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private calculMetier metier ; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcul() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	metier = new calculImp();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("calculModel", new calculModel());
		request.getRequestDispatcher("Vue.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String operator = request.getParameter("opertator");
		int op1 = Integer.parseInt(request.getParameter("op1"))   ;
		int op2 = Integer.parseInt(request.getParameter("op2"))   ;
		
		calculModel model = new calculModel();
		
		model.setOp1(op1);
		model.setOp2(op2);
		model.setOperator(operator);
		
		int res = metier.calc(op1, op2, operator);
		model.setRes(res);
		
		request.setAttribute("calculModel", model);
		request.getRequestDispatcher("Vue.jsp").forward(request, response);
	}

}
