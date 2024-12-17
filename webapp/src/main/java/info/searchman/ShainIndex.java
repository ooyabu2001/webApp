package info.searchman;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShainIndex
 */
@WebServlet("/ShainIndex")
public class ShainIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShainIndex() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//社員リストを作る
		ArrayList<ShainBean> shainList = new ArrayList<>();

		//社員１を作る
		ShainBean shain1 = new ShainBean();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setSei("男");
		shain1.setNen(2003);
		shain1.setAddress("宮城県仙台市");
		//社員リストに追加
		shainList.add(shain1);

		//社員２を作る
		ShainBean shain2 = new ShainBean();
		shain2.setId(102);
		shain2.setName("佐藤香織");
		shain2.setSei("女");
		shain2.setNen(2004);
		shain2.setAddress("福岡県福岡市");
		//社員リストに追加
		shainList.add(shain2);

		// 更新社員をセットする
		request.setAttribute("shainList", shainList);

		// index.jspへ転送
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
