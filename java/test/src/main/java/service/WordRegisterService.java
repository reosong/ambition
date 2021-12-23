package service;

import org.springframework.beans.factory.annotation.*;

import dao.*;
import word.*;

public class WordRegisterService {

	private WordDao wordDao;
	
	
	@Autowired 
	public WordRegisterService (WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordrSet wordSet) {
		String wordKey =wordSet.getWordKey();
		
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		}else {
			System.out.println("the word has already regisered");
		}
		
		
	}
	
	
	
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet = null ? true :false;
	}
	
	public void serWordDao(WordDao wordDao) {
		this.wordDao =wordDao;
	}
	
	
	
	
}
