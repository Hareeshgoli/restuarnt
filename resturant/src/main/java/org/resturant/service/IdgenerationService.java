package org.resturant.service;

import org.resturant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdgenerationService {
	
	
	
	

		@Autowired 
		CategoryRepository categoryRepository;
		public String idGenerator(char c) {
		 String id = null;
			try{
			if(c=='c') {
				id=categoryRepository.getLastId().getCatagoraryId();
				System.out.println(id+"sdjd");
				if(id==null)
					id="C0001";
				else 
					id="C" + (Integer.parseInt(id.substring(1,id.length()))+1);
			}
			else
			{
				id=null;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return id;	
		}
	
}
