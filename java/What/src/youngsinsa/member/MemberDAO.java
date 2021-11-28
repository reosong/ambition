package youngsinsa.member;

import java.io.*;
import org.apache.*;

public class MemberDAO {
	private MemberDAO() {
		
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	
	
	private SqlSession getSession() {
		Reader reader = null;
		try {
			reader= Resources.getResourceAsReader("./SqlMapConfig.xml");
			
		}
	}
	

}
