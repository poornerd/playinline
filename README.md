playinline
==========

Inline Editing of Play! Framwork 2 Scala Templates in the Browser

Usage:

1. Add dependency to project/Build.scala:
``` 
  val appDependencies = Seq(
      "com.poornerd" % "playinline_2.10" % "1.0-SNAPSHOT"
      // the rest here
  )
``` 
and
``` 
  resolvers += Resolver.url("playinline repository", url("http://poornerd.github.com/releases/"))(Resolver.ivyStylePatterns)
``` 
2. Create a conf/message file if you do not already have one. (add a comment with # if it is empty)
3. Make sure you have JQuery included in you main.scala.html (master templates)
4. Add this include to you main.scala.html before the end of the body tag (or in your master templates at the appropriate position):
``` 
@playinline.playInlineFooter()
``` 
5. Add this to your conf/application.conf to make the messages editable in DEVELOP mode:
``` 
#playinline config                                                                                                                                                                           
  playinline.admin=true
```
6. Add this to your conf/routes so that the routes from the module are used in your application:
``` 
-> /playinline               playinline.Routes
``` 

Now you can add @Messages("message.key") tags to any template and edit them.

You can edit HTML elements from the templates in the template as well be doing the following:

1. Add a key with the filename for the template, so that 
``` 
@session.put("playinline.filename." + request.uri,"index.scala.html")
``` 
2. Add a unique ID to the HTML element you want to be editable, and add the class "editable" like this:
```
<p id="firsttest" class="editable">This is some HTML to edit!</p>
```
