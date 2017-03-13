package reviewSite;



public class Review {

	private long id;
	private String title;
	private String imgURL;
	private String reviewCategory;
	private String synopsis;
	private String description;
	
	
	public Review(Long id,String title, String imgURL, String reviewCategory, String synopsis, String description){
		// this.id=id;  etc  remove from others?
		this.id=id;
		this.title = title;
		this.imgURL= imgURL;
		this.reviewCategory = reviewCategory;
		this.synopsis = synopsis;
		this.description = description;
		
		
	}
	
	
	
	public long getId(){
		
		return id;
				
	}
	
	public String getTitle(){ 
		
		return title;
		
		
	}
	
	public String getImgURL(){
		
		
		return imgURL ;
	}
	
	public String getReviewCategory(){
		
		return reviewCategory ;
		
	}
	

	public String getSynopsis(){
		
		return synopsis  ;
		
	}

	public String getDescription(){
	
		return description  ;
		
	} 
}


