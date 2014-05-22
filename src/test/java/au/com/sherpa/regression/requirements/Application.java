package au.com.sherpa.regression.requirements;

import net.thucydides.core.annotations.Feature;

public class Application {
    
	@Feature
	public class Authentication{
		public class Login{}
	}
	
	@Feature
	public class Recruitment{
		public class CreateRecruitmentAccount{}
		public class PostJob{}
		public class NetworkFeed{}
	}
	
	@Feature
	public class Groups{
		public class CreateGroups{}
		
	}
	
	@Feature
	public class Rosters{
		public class CreateRoster{}
	}
	
	@Feature
	public class Training{
		public class MyTraining{}
		public class Course{}
	}
	
}