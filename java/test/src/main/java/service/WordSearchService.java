package service;

import dao.*;
import word.*;

public class WordSearchService {
	
	private WordDao wordDao;
	
	
	public WordSearchService(WrodDao wordDao) {
		this.wordDao = wordDao;
	}
	public WordSet searchWord (String wordKey) {
		if(verify(wordKey)) {
			return wordDao.select(wordKey);
		}else {
			System.out.println("WordKey information is available");
		}
		return null;
	}

	
	
	
	
	
	 
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true :false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao= wordDao;
	}
}
