# Homework 1

For this homework, your Java program should be submitted as a single file PollettWebPageClient.java within the Hw1.zip that you submit. To test your code, the grader (probably me) will unzip your Hw1.zip and cd into that directory. Your program will then be compiled from the command line via the command: 

`javac PollettWebPageClient.java`

using a version of Java SE as old as 1.7.0_51. Once compiled your program will be run using some variant of a line like:

`java PollettWebPageClient some_path`

Notice I am not adding any package info to the class I am running, and I am not switching into any sub directories of Hw1, so avoid package declarations and make sure to test from the command line, not within any IDE. Your program when run should use java.net.Socket to make a connection to port 80 of www.cs.sjsu.edu. It should obtain a java.io.OutputStream from the constructed Socket and use this to make an HTTP/1.1 GET request for `/faculty/pollett/some_path`. It should send the Host header with value `www.cs.sjsu.edu`. It should the use the java.io.InputStream obtained from the Socket to get the web server's response and use System.out to print this response verbatim. Here are a couple examples of possible `some_path's` that might be tested:

```
174.23.16f/
masters/
index.shtml
../pollett/
```

You will notice in the web server's response that it sends the headers: Accept-Ranges, X-FRAME-OPTIONS, Transfer-Encoding. For each of these headers, note down the particular value given by the CS Department web server. In a file ResponseHeaders.txt that you should also include in Hw1.zip, write up a short explanation of what each of these headers is for and what each of the values given by the CS Department web server means.

For the second part of the this homework, I want you to channel your inner crackpot and make a small web site about your favorite `conspiracy` theory. This site should consist of at least three HTML 5 validating pages which you should place in a conspiracy sub-folder of the Hw1.zip file you submit. One of these pages should be a file named `index.html` and it is from this page the grader will explore your site. The two other pages should be linked via an a tag from this page, and you should use a relative link so that it doesn't matter which subfolder of document root I test your code in. Each of your pages must also have an unordered list on it, a span tag, an img tag, and a table tag. The link for the image should be relative and the image file should be a png. Use the span tag to give a tooltip suggestion over some bold-faced text to reveal some extra-spooky, additional conspiracy information. Use tables with two columns: one for the "truth" and one for what "they" would have you believe. You should use a link tag to specify a favicon. Other than these requirements, be creative, and have fun making this site. Also, keep the conspiracies light-hearted.