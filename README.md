# BlogApi

Api Root Url : 
https://bloappapi.herokuapp.com/api/

1.Get Blog
https://bloappapi.herokuapp.com/api/blog/get

2.Pos Blog
https://bloappapi.herokuapp.com/api/blog/save

Body :

{
	"title":"temp",
	"description":"this is temp",
	"url":"www.acac.com"
}

3.Update Blog
https://bloappapi.herokuapp.com/api/blog/update/33
Body:
{
	"id":33,
	"title":"update",
	"description":"you updated",
	"url":"www.acac.com"
}
  
  
4.Delete Blog
https://bloappapi.herokuapp.com/api/blog/delete/33


How to push git project in Heroku.

Heroku deploy step.

1.heroku login
2.git add .
3.git commit - "message"
3.git push heroku master

//check log
heroku logs -t

//Get heroku application detail
heroku info

