/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Pivotal tc Runtime 3.0.0.RELEASE/7.0.55.A.RELEASE
 * Generated at: 2014-08-29 19:30:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.controllers.resources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/insight.tld", Long.valueOf(1404339226000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\t<div class=\"page-module\">\n");
      out.write("\t\t<div class=\"page-module-header\">\n");
      out.write("\t\t\t<h2>Applications</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"page-module-body\">\n");
      out.write("\t\t\t<div id=\"resource-tree-applications\"><span class=\"example\">Loading...</span></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tdojo.addOnLoad(function(){\n");
      out.write("\t\tdojo.require(\"dijit.tree.TreeStoreModel\");\n");
      out.write("\t\tdojo.require(\"insight.resources.InsightResourceReadStore\");\n");
      out.write("\t\tdojo.require(\"insight.resources.ResourceKey\");\n");
      out.write("\t\tdojo.require(\"insight.resources.ResourceTree\");\n");
      out.write("\n");
      out.write("\t\tvar timeRange = Insight.getTimeRange();\n");
      out.write("\t\tvar serviceUrl = Insight.buildUri(\"/services/resources/{resourceKey}/{start}/{end}\", { type: \"json\", sortField: \"responseTimeScore\", sortDesc: true, start: timeRange.getStart(), end: timeRange.getEnd() });\n");
      out.write("\t\tvar healthLampUrl = Insight.buildUri(\"/static/images/health/healthlamp-{lamp}.png\", { lamp: \"nosample\" });\n");
      out.write("\n");
      out.write("\t\tvar rootItems = [\n");
      out.write("\t\t\t{ resourceKey: \"insight:type=Application\", resourceLabel: \"All Applications\", id: \"resource-tree-applications\" }\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t];\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\tdojo.forEach(rootItems, function(rootItem, i , a) {\n");
      out.write("\t\t\tvar store = new insight.resources.InsightResourceReadStore({\n");
      out.write("\t\t\t\turl: serviceUrl,\n");
      out.write("\t\t\t\troot: rootItem,\n");
      out.write("\t\t\t\tupdateTimeRange: function(timeRange) {\n");
      out.write("\t\t\t\t\tthis.url = this.url.append(\"\", { start: timeRange.getStart(), end: timeRange.getEnd() });\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tvar model = new dijit.tree.TreeStoreModel({\n");
      out.write("\t\t\t\tstore: store,\n");
      out.write("\t\t\t\troot: store.getItems()[0],\n");
      out.write("\t\t\t\tdeferItemLoadingUntilExpand: true\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tvar tree = new insight.resources.ResourceTree({\n");
      out.write("\t\t\t\tmodel: model,\n");
      out.write("\t\t\t\thealthLampUrl: healthLampUrl\n");
      out.write("\t\t\t}, rootItem.id);\n");
      out.write("\t\t\ttree.connect(tree, \"onClick\", function(item, nodeWidget, e) {\n");
      out.write("\t\t\t\tif(store.isItem(item) && !item.doNotLoad){\n");
      out.write("\t\t\t\t\t// TODO account for the other tree\n");
      out.write("\t\t\t\t\tvar resourceKey = new insight.resources.ResourceKey(store.getIdentity(item));\n");
      out.write("\t\t\t\t\tdojo.forEach(a, function(altRootItem){\n");
      out.write("\t\t\t\t\t\tif (altRootItem !== rootItem) {\n");
      out.write("\t\t\t\t\t\t\tvar t = dijit.byId(altRootItem.id),\n");
      out.write("\t\t\t\t\t\t\t\ts = t.model.store;\n");
      out.write("\t\t\t\t\t\t\tresourceKey = resourceKey.merge(s.getIdentity(t.get(\"selectedItem\")));\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}, this);\n");
      out.write("\t\t\t\t\tInsight.loadResource(resourceKey);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\ttree.subscribe(\"Insight.timeRangeMajorPulse\", function(timeRange) {\n");
      out.write("\t\t\t\t// stagger the refresh\n");
      out.write("\t\t\t\tif (this._refreshTimeout) {\n");
      out.write("\t\t\t\t\tclearTimeout(this._refreshTimeout);\n");
      out.write("\t\t\t\t\tthis._refreshTimeout = null;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tthis.refreshTimeout = setTimeout(dojo.hitch(this, function() {\n");
      out.write("\t\t\t\t\tthis._refreshTimeout = null;\n");
      out.write("\t\t\t\t\tstore.updateTimeRange(timeRange);\n");
      out.write("\t\t\t\t\tstore.refresh();\n");
      out.write("\t\t\t\t}), 2000);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\ttree.subscribe(\"Insight.highlightTreeResource\", function(resourceKey) {\n");
      out.write("\t\t\t\tif (rootItem.transformer) {\n");
      out.write("\t\t\t\t\tresourceKey = rootItem.transformer(resourceKey);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\ttree.highlightResource(resourceKey);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\ttree.startup();\n");
      out.write("\t\t});\n");
      out.write("\t\tInsight.highlightResourceInTree();\n");
      out.write("\t});\n");
      out.write("</script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/controllers/resources/tree.jsp(10,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty timeZone}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_fmt_005fsetTimeZone_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fsetTimeZone_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setTimeZone
    org.apache.taglibs.standard.tag.rt.fmt.SetTimeZoneTag _jspx_th_fmt_005fsetTimeZone_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.SetTimeZoneTag) _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetTimeZoneTag.class);
    _jspx_th_fmt_005fsetTimeZone_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fsetTimeZone_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/controllers/resources/tree.jsp(11,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetTimeZone_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timeZone}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fsetTimeZone_005f0 = _jspx_th_fmt_005fsetTimeZone_005f0.doStartTag();
    if (_jspx_th_fmt_005fsetTimeZone_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fsetTimeZone_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fsetTimeZone_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fsetTimeZone_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/controllers/resources/tree.jsp(23,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not devEdition}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<div class=\"page-module\">\n");
        out.write("\t\t\t<div class=\"page-module-header\">\n");
        out.write("\t\t\t\t<h2>Instances</h2>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"page-module-body\">\n");
        out.write("\t\t\t\t<div id=\"resource-tree-servers\"><span class=\"example\">Loading...</span></div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</div>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/controllers/resources/tree.jsp(48,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not devEdition}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t, { resourceKey: \"insight:type=Server\", resourceLabel: \"All Instances\", id: \"resource-tree-servers\" }\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/controllers/resources/tree.jsp(53,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not devEdition}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\trootItems[0].transformer = function(key) {\n");
        out.write("\t\t\t\tkey = new insight.resources.ResourceKey(key).makeComponentlessKey(\"Server\");\n");
        out.write("\t\t\t\treturn key ? key.toString() : \"insight:type=Application\";\n");
        out.write("\t\t\t};\n");
        out.write("\t\t\trootItems[1].transformer = function(key) {\n");
        out.write("\t\t\t\tkey = new insight.resources.ResourceKey(key).makeComponentKey(\"Server\");\n");
        out.write("\t\t\t\treturn key ? key.toString() : \"insight:type=Server\";\n");
        out.write("\t\t\t};\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
