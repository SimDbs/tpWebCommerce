/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-17 13:52:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import commerce.catalogue.service.CatalogueManager;
import commerce.catalogue.domaine.modele.Article;
import commerce.catalogue.domaine.modele.Livre;
import commerce.catalogue.domaine.modele.Musique;
import commerce.catalogue.domaine.modele.Piste;
import commerce.gestion.Panier;
import commerce.gestion.LignePanier;
import java.util.Iterator;
import java.util.List;

public final class accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/piedDePage.html", Long.valueOf(1583945372581L));
    _jspx_dependants.put("/enTetePage.html", Long.valueOf(1583945372536L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Site web marchand</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" id=\"storefront-woocommerce-style-css\" href=\"./css/themes/storefont/assets/sass/woocommerce/woocommerce.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./js/jplayer-2.9.2/skin/blue.monday/css/jplayer.blue.monday.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/styleAdd.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jplayer-2.9.2/jplayer/jquery.jplayer.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jplayer-2.9.2/add-on/jplayer.playlist.min.js\"></script>\r\n");
      out.write("<style id='storefront-style-inline-css' type='text/css'>\r\n");
      out.write("\t\t\ttable.cart td.product-remove,\r\n");
      out.write("\t\t\ttable.cart td.actions {\r\n");
      out.write("\t\t\t\tborder-top-color: #ffffff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"inner-wrapper\">\r\n");
      out.write("\t\t\t<header id=\"header\" class=\"col-full\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"site-title\">Site web marchand</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\t<nav id=\"navigation\" class=\"col-full\" role=\"navigation\">\r\n");
      out.write("\t\t<ul id=\"main-nav\" class=\"nav fl\">\r\n");
      out.write("\t\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(response.encodeURL("./accueil.jsp"));
      out.write("\">Accueil</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(response.encodeURL("./afficheRecherche.jsp"));
      out.write("\">Catalogue</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>Toutes les catégories</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>Musique</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>Livre</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(response.encodeURL("./controlePanier.jsp"));
      out.write("\">Panier</a>\r\n");
      out.write("\t\t\t\t");
 
				if (session.getAttribute("panier") != null) {
					Panier lePanier = (Panier) session.getAttribute("panier");
					List<LignePanier> lignesPanier = lePanier.getLignesPanier();
					if(lignesPanier.size() != 0){
						int nbElem = 0;
						for(LignePanier ligne : lignesPanier){
							nbElem += ligne.getQuantite();
						}	
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p class=\"nbArticle\">");
      out.print( nbElem );
      out.write("</p>\r\n");
      out.write("\t\t\t\t");

					}
				}
				
      out.write("\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"searchDiv\">\r\n");
      out.write("\t\t\t<form method=\"POST\" action=\"afficheRecherche.jsp\">\r\n");
      out.write("\t\t\t \t<input type=\"text\" name=\"searchValue\" placeholder=\"Rechercher...\" class=\"searchInput\"/>\r\n");
      out.write("\t\t\t \t<input type=\"submit\" class=\"searchButton\"/>\r\n");
      out.write("\t\t \t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=accueil_message>\r\n");
      out.write("\r\n");
      out.write("\t<h1 class=\"titre_accueil\"> Bienvenue sur ShopTonArticle </h1>\r\n");
      out.write("\t<p>Vous trouverez tout ce dont vous avez besoin, que ce soit un livre ou une musique...</p>\r\n");
      out.write("\t<p>Alors n'attendez plus, commencez a chercher ce qui vous fait envie dans l'onglet catalogue et ajoutez vos artciles preferes au panier.</p>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer id=\"footer\" class=\"col-full\">\r\n");
      out.write("\t\t\t<div id=\"credit\" class=\"col-right\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<object type=\"image/svg+xml\" data=\"./images/deezer.svg\" width=\"152\" height=\"34\"></object>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tDesigned by\r\n");
      out.write("\t\t\t\t\t<a title=\"Premium WordPress Themes & Plugins by WooThemes\" alt=\"Premium WordPress Themes & Plugins by WooThemes\" href=\"http://www.woothemes.com/\">\r\n");
      out.write("\t\t\t\t\t\t<img width=\"74\" height=\"19\" alt=\"WooThemes\" src=\"./images/woothemes.png\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
