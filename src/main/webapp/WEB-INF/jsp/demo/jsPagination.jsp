<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String contextPath = request.getContextPath();
	request.setAttribute("_base", contextPath);

	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Pragma", "No-cache");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>pagination</title>
<meta name="description" content="pagination">
<meta name="keywords" content="jquery, pagination, javascript, plugin" />
<meta name="author" content="Luís Almeida">

<meta name="viewport" content="width=device-width,initial-scale=1">

<link rel="stylesheet" href="${_base}/js/jquery/jPages/css/style.css">
<link rel="stylesheet" href="${_base}/js/jquery/jPages/css/jPages.css">
<link rel="stylesheet" href="${_base}/js/jquery/jPages/css/animate.css">
<link rel="stylesheet" href="${_base}/js/jquery/jPages/css/github.css">

<script type="text/javascript"
	src="${_base}/js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="${_base}/js/jquery/jPages/js/highlight.pack.js"></script>
<script type="text/javascript"
	src="${_base}/js/jquery/jPages/js/tabifier.js"></script>
<script type="text/javascript" src="${_base}/js/jquery/jPages/js/js.js"></script>
<script type="text/javascript"
	src="${_base}/js/jquery/jPages/js/jPages.min.js"></script>



<script>
	/* when document is ready */
	$(function() {

		/* initiate the plugin 
		*perPage 每页多少条
		*delay 开始加载数据的毫米数
		*/
		$(function() {
			$("div.holder").jPages({
				containerID : "movies",
				previous : "上一页",
				next : "下一页",
				perPage : 5,
				delay : 20,
				first:"首页",
				last:"最后一页"
			
			});
		});

	});
</script>

<style type="text/css">
  table{ width: 100%; margin-top: 30px; }
  td, th{ text-align: left; height:25px; }
  th { background: #f5f5f5; }
  th:nth-child(1){ width:10%; }
  th:nth-child(2){ width:10%; }
  th:nth-child(3){ width:60%; }
  th:nth-child(4){ width:20%;}

  </style>
</head>
<body>

	<div id="content" class="defaults"  style="overflow:hidden ;max-height: 255px">
		<h2>Table</h2>
		<!-- navigation holder -->
		<div class="holder"></div>
		
		<table >
			<thead>
				<tr>
					<th>Rank</th>
					<th>Rating</th>
					<th>Title</th>
					<th>Votes</th>
				</tr>
			</thead>
			<tbody id="movies">
				<tr>
					<td>1.</td>
					<td>9.2</td>
					<td>The Shawshank Redemption (1994)</td>
					<td>699,295</td>
				</tr>
				<tr>
					<td>2.</td>
					<td>9.2</td>
					<td>The Godfather (1972)</td>
					<td>524,507</td>
				</tr>
				<tr>
					<td>3.</td>
					<td>9.0</td>
					<td>The Godfather: Part II (1974)</td>
					<td>329,051</td>
				</tr>
				<tr>
					<td>4.</td>
					<td>8.9</td>
					<td>Il buono, il brutto, il cattivo. (1966)</td>
					<td>219,022</td>
				</tr>
				<tr>
					<td>5.</td>
					<td>8.9</td>
					<td>Pulp Fiction (1994)</td>
					<td>549,166</td>
				</tr>
				<tr>
					<td>6.</td>
					<td>8.9</td>
					<td>12 Angry Men (1957)</td>
					<td>170,234</td>
				</tr>
				<tr>
					<td>7.</td>
					<td>8.9</td>
					<td>Schindler's List (1993)</td>
					<td>366,494</td>
				</tr>
				<tr>
					<td>8.</td>
					<td>8.8</td>
					<td>The Dark Knight (2008)</td>
					<td>634,065</td>
				</tr>
				<tr>
					<td>9.</td>
					<td>8.8</td>
					<td>One Flew Over the Cuckoo's Nest (1975)</td>
					<td>292,690</td>
				</tr>
				<tr>
					<td>10.</td>
					<td>8.8</td>
					<td>The Lord of the Rings: The Return of the King (2003)</td>
					<td>489,205</td>
				</tr>
				<tr>
					<td>11.</td>
					<td>8.8</td>
					<td>Star Wars: Episode V - The Empire Strikes Back (1980)</td>
					<td>357,625</td>
				</tr>
				<tr>
					<td>12.</td>
					<td>8.8</td>
					<td>Fight Club (1999)</td>
					<td>525,429</td>
				</tr>
				<tr>
					<td>13.</td>
					<td>8.8</td>
					<td>Inception (2010)</td>
					<td>483,986</td>
				</tr>
				<tr>
					<td>14.</td>
					<td>8.8</td>
					<td>Shichinin no samurai (1954)</td>
					<td>121,275</td>
				</tr>
				<tr>
					<td>15.</td>
					<td>8.7</td>
					<td>The Lord of the Rings: The Fellowship of the Ring (2001)</td>
					<td>510,260</td>
				</tr>
				<tr>
					<td>16.</td>
					<td>8.7</td>
					<td>Goodfellas (1990)</td>
					<td>309,394</td>
				</tr>
				<tr>
					<td>17.</td>
					<td>8.7</td>
					<td>Star Wars (1977)</td>
					<td>403,247</td>
				</tr>
				<tr>
					<td>18.</td>
					<td>8.7</td>
					<td>Cidade de Deus (2002)</td>
					<td>230,654</td>
				</tr>
				<tr>
					<td>19.</td>
					<td>8.7</td>
					<td>Casablanca (1942)</td>
					<td>206,525</td>
				</tr>
				<tr>
					<td>20.</td>
					<td>8.7</td>
					<td>The Matrix (1999)</td>
					<td>507,866</td>
				</tr>
				<tr>
					<td>21.</td>
					<td>8.7</td>
					<td>C'era una volta il West (1968)</td>
					<td>100,585</td>
				</tr>
				<tr>
					<td>22.</td>
					<td>8.7</td>
					<td>Rear Window (1954)</td>
					<td>151,875</td>
				</tr>
				<tr>
					<td>23.</td>
					<td>8.7</td>
					<td>Raiders of the Lost Ark (1981)</td>
					<td>308,264</td>
				</tr>
				<tr>
					<td>24.</td>
					<td>8.7</td>
					<td>The Silence of the Lambs (1991)</td>
					<td>335,346</td>
				</tr>
				<tr>
					<td>25.</td>
					<td>8.7</td>
					<td>The Usual Suspects (1995)</td>
					<td>340,827</td>
				</tr>
				<tr>
					<td>26.</td>
					<td>8.6</td>
					<td>Se7en (1995)</td>
					<td>395,454</td>
				</tr>
				<tr>
					<td>27.</td>
					<td>8.6</td>
					<td>Psycho (1960)</td>
					<td>187,005</td>
				</tr>
				<tr>
					<td>28.</td>
					<td>8.6</td>
					<td>Forrest Gump (1994)</td>
					<td>433,687</td>
				</tr>
				<tr>
					<td>29.</td>
					<td>8.6</td>
					<td>The Lord of the Rings: The Two Towers (2002)</td>
					<td>438,900</td>
				</tr>
				<tr>
					<td>30.</td>
					<td>8.6</td>
					<td>It's a Wonderful Life (1946)</td>
					<td>131,435</td>
				</tr>
				<tr>
					<td>31.</td>
					<td>8.6</td>
					<td>Memento (2000)</td>
					<td>369,980</td>
				</tr>
				<tr>
					<td>32.</td>
					<td>8.6</td>
					<td>Léon (1994)</td>
					<td>285,163</td>
				</tr>
				<tr>
					<td>33.</td>
					<td>8.6</td>
					<td>Sunset Blvd. (1950)</td>
					<td>70,456</td>
				</tr>
				<tr>
					<td>34.</td>
					<td>8.6</td>
					<td>Dr. Strangelove or: How I Learned to Stop Worrying and
						Love the Bomb (1964)</td>
					<td>188,961</td>
				</tr>
				<tr>
					<td>35.</td>
					<td>8.6</td>
					<td>Apocalypse Now (1979)</td>
					<td>219,741</td>
				</tr>
				<tr>
					<td>36.</td>
					<td>8.5</td>
					<td>American History X (1998)</td>
					<td>317,621</td>
				</tr>
				<tr>
					<td>37.</td>
					<td>8.5</td>
					<td>North by Northwest (1959)</td>
					<td>115,377</td>
				</tr>
				<tr>
					<td>38.</td>
					<td>8.5</td>
					<td>Citizen Kane (1941)</td>
					<td>167,191</td>
				</tr>
				<tr>
					<td>39.</td>
					<td>8.5</td>
					<td>Terminator 2: Judgment Day (1991)</td>
					<td>320,574</td>
				</tr>
				<tr>
					<td>40.</td>
					<td>8.5</td>
					<td>American Beauty (1999)</td>
					<td>380,457</td>
				</tr>
				<tr>
					<td>41.</td>
					<td>8.5</td>
					<td>Saving Private Ryan (1998)</td>
					<td>361,057</td>
				</tr>
				<tr>
					<td>42.</td>
					<td>8.5</td>
					<td>Toy Story 3 (2010)</td>
					<td>183,628</td>
				</tr>
				<tr>
					<td>43.</td>
					<td>8.5</td>
					<td>Taxi Driver (1976)</td>
					<td>215,096</td>
				</tr>
				<tr>
					<td>44.</td>
					<td>8.5</td>
					<td>Alien (1979)</td>
					<td>234,324</td>
				</tr>
				<tr>
					<td>45.</td>
					<td>8.5</td>
					<td>Sen to Chihiro no kamikakushi (2001)</td>
					<td>148,270</td>
				</tr>
				<tr>
					<td>46.</td>
					<td>8.5</td>
					<td>City Lights (1931)</td>
					<td>40,299</td>
				</tr>
				<tr>
					<td>47.</td>
					<td>8.5</td>
					<td>Vertigo (1958)</td>
					<td>115,948</td>
				</tr>
				<tr>
					<td>48.</td>
					<td>8.5</td>
					<td>The Shining (1980)</td>
					<td>244,669</td>
				</tr>
				<tr>
					<td>49.</td>
					<td>8.5</td>
					<td>Paths of Glory (1957)</td>
					<td>57,711</td>
				</tr>
				<tr>
					<td>50.</td>
					<td>8.5</td>
					<td>M (1931)</td>
					<td>50,917</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
