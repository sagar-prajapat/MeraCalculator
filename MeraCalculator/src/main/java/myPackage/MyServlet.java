package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String[] jokes = {
    		   "अगर किसी लड़की का नाम खुशी हो और वह रो रही हो, तो कोई गंभीरता से नहीं लेगा! क्योंकि लोग सोचेंगे- 'ये खुशी के आंसू' हैं",
    		   "बड़ा अच्छा लगता है जब-जब सोनी का फोन हैंग होता है, क्योंकि- 'सोनी के नखरे सोणे लग दे मैनू...'",
    		   "अगर श्रीदेवी अपना एक शोरूम खोलें, तो वह कहेंगी, 'अभी 'बोनी' का टाइम है!'",
    		   "टीचर- Date और तारीख में क्या अंतर है ? सारी Class चुप गप्पू- सर, Date में Girlfriend के साथ जाते है और तारीख में वकील के साथ"   
       };
  
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		//type casting
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
//		int sum = num1+num2;
		
		int ans;
		if(str3.equals("1")) ans=a+b;
		
		else if(str3.equals("2")) ans=a-b;
		
		else if(str3.equals("3")) ans=a*b;
		
		else ans=a/b;
//		response.getWriter().append("Ans :"+ans);
		
		int randomIndex = (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];
		response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+ java.net.URLEncoder.encode(randomJoke, "UTF-8"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
