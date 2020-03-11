/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 16:15:53 UTC
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
import commerce.gestion.Panier;
import commerce.gestion.LignePanier;
import java.util.Iterator;

public final class affichePanier_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/piedDePage.html", Long.valueOf(1551293940000L));
    _jspx_dependants.put("/enTetePage.html", Long.valueOf(1583937271384L));
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

	if (session.getAttribute("panier") == null) {
		response.sendRedirect("./index.jsp");
	} else {
		Panier lePanier = (Panier) session.getAttribute("panier");
		CatalogueManager catalogueManager = (CatalogueManager) application
				.getAttribute("catalogueManager");

      out.write("\r\n");
      out.write("<nav id=\"navigation\" class=\"col-full\" role=\"navigation\">\r\n");
      out.write("\t<ul id=\"main-nav\" class=\"nav fl\">\r\n");
      out.write("\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(response.encodeURL("./afficheRecherche.jsp"));
      out.write("\">Rechercher\r\n");
      out.write("\t\t\t\tun article</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(response.encodeURL("./controlePanier.jsp"));
      out.write("\">Panier</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"content\" class=\"col-full\">\r\n");
      out.write("\t<div id=\"main-sidebar-container\">\r\n");
      out.write("\t\t<section class=\"entry\">\r\n");
      out.write("\t\t\t<div class=\"woocommerce\">\r\n");
      out.write("\t\t\t\t<form\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.print(response
							.encodeURL("controlePanier.jsp?commande=recalculerPanier"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"panier\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<table class=\"shop_table cart\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-remove\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-thumbnail\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-name\">Produit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-price\">Prix</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-quantity\">Quantité</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"product-subtotal\">Total</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t");

							Iterator it;
							Article unArticle;
							it = lePanier.getLignesPanier().iterator();
									LignePanier uneLignePanier;
									while (it.hasNext()) {
										uneLignePanier = (LignePanier) it.next();
										unArticle = uneLignePanier.getArticle();
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"cart_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-remove\"><a class=\"remove\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Remove this item\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"");
      out.print(response
								.encodeURL("./controlePanier.jsp?refArticle="
										+ uneLignePanier.getArticle()
												.getRefArticle()
										+ "&amp;commande=supprimerLigne"));
      out.write("\">×</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-thumbnail\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"attachment-shop_thumbnail wp-post-image\" width=\"145\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"145\" alt=\"hoodie_4_front\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
 if (unArticle.getImage().startsWith("http")) 
									    out.print(unArticle.getImage()) ;
							        else
							        	out.print("./images/"+unArticle.getImage()) ; 
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-name\">");
      out.print(unArticle.getTitre());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-price\"><span class=\"amount\">");
      out.print(uneLignePanier.getPrixUnitaire());
      out.write("€</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-quantity\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"quantity\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"input-text qty text\" type=\"number\" size=\"4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttitle=\"Qty\" value=\"");
      out.print(uneLignePanier.getQuantite());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"cart[");
      out.print(uneLignePanier.getArticle().getRefArticle());
      out.write("][qty]\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmin=\"1\" step=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"product-subtotal\"><span class=\"amount\">");
      out.print(uneLignePanier.getPrixTotal());
      out.write("€</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"actions\" colspan=\"6\"><input class=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"submit\" value=\"Mise à jour du panier\" name=\"update_cart\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"cart-collaterals\">\r\n");
      out.write("\t\t\t\t\t<div class=\"cross-sells\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"cart_totals \">\r\n");
      out.write("\t\t\t\t\t\t<h2>Total de la commande</h2>\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"cart-subtotal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Sous-total</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><span class=\"amount\">");
      out.print(lePanier.getTotal());
      out.write("€</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"shipping\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Frait de port</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Gratuit</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"order-total\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Total</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><strong> <span class=\"amount\">");
      out.print(lePanier.getTotal());
      out.write("€</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wc-proceed-to-checkout\">\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"");
      out.print(response
							.encodeURL("./controleCommande.jsp?commande=effectuerCommander"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"checkout-button button alt wc-forward\">Effectuer la\r\n");
      out.write("\t\t\t\t\t\t\t\tcommande</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wc-proceed-to-checkout\">\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"");
      out.print(response
							.encodeURL("./controlePanier.jsp?commande=viderPanier"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"checkout-button button alt\">Vider le panier</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");

	}

      out.write('\r');
      out.write('\n');
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
