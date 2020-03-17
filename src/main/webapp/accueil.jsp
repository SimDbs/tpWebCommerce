<%@ page pageEncoding="UTF-8"%>
<%@ include file="enTetePage.html"%>
<%@ page import="commerce.catalogue.service.CatalogueManager"%>
<%@ page import="commerce.catalogue.domaine.modele.Article"%>
<%@ page import="commerce.catalogue.domaine.modele.Livre"%>
<%@ page import="commerce.catalogue.domaine.modele.Musique"%>
<%@ page import="commerce.catalogue.domaine.modele.Piste"%>
<%@ page import="commerce.gestion.Panier"%>
<%@ page import="commerce.gestion.LignePanier"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%
	if (session.getAttribute("panier")==null) {
		response.sendRedirect("./index.jsp");
	} else {
		CatalogueManager catalogueManager = (CatalogueManager) application
										.getAttribute("catalogueManager");
		List<Article> articles;
		if(request.getParameter("searchValue") != null){
			articles = catalogueManager.rechercher(request.getParameter("searchValue"));
		}else{
			articles = catalogueManager.getArticles();
		}
		Iterator<Article> listeDesArticles;
		Livre livre = null;
		Musique musique = null;
		Article article;
%>
	<nav id="navigation" class="col-full" role="navigation">
		<ul id="main-nav" class="nav fl">
			<li id="menu-item-290"
				class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item">
				<a href="<%=response.encodeURL("./accueil.jsp")%>">Accueil</a>
			</li>
			<li id="menu-item-290"
				class="menu-item menu-item-type-custom menu-item-object-custom">
				<a href="<%=response.encodeURL("./afficheRecherche.jsp")%>">Catalogue</a>
				<ul>
					<li>
						<a>Toutes les catégories</a>
					</li>
					<li>
						<a>Musique</a>
					</li>
					<li>
						<a>Livre</a>
					</li>
				</ul>
			</li>
			<li id="menu-item-290"
				class="menu-item menu-item-type-custom menu-item-object-custom">
				<a href="<%=response.encodeURL("./controlePanier.jsp")%>">Panier</a>
				<% 
				if (session.getAttribute("panier") != null) {
					Panier lePanier = (Panier) session.getAttribute("panier");
					List<LignePanier> lignesPanier = lePanier.getLignesPanier();
					if(lignesPanier.size() != 0){
						int nbElem = 0;
						for(LignePanier ligne : lignesPanier){
							nbElem += ligne.getQuantite();
						}	
				%>
						<p class="nbArticle"><%= nbElem %></p>
				<%
					}
				}
				%>
			</li>
		</ul>
		<div class="searchDiv">
			<form method="POST" action="afficheRecherche.jsp">
			 	<input type="text" name="searchValue" placeholder="Rechercher..." class="searchInput"/>
			 	<input type="submit" class="searchButton"/>
		 	</form>
		</div>
	</nav>

<%
	}
%>




<div class=accueil_message>

	<h1 class="titre_accueil"> Bienvenue sur ShopTonArticle </h1>
	<p>Vous trouverez tout ce dont vous avez besoin, que ce soit un livre ou une musique...</p>
	<p>Alors n'attendez plus, commencez a chercher ce qui vous fait envie dans l'onglet catalogue et ajoutez vos artciles preferes au panier.</p>
	

</div>

<%@ include file="piedDePage.html"%>