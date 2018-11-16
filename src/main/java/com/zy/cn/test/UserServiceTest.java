package com.zy.cn.test;

import com.zy.cn.dao.UserDAO;
import com.zy.cn.entity.User;
import com.zy.cn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest  extends Application{

    @Autowired
    private UserDAO userDAO;

    @Autowired
    UserService userService;

    /***
     *
     */
    @Test
    public void cencelTaskInst(){
       /* List<User> users = userDAO.queryAll();
        for (User user : users) {
            System.out.println(user);
        }

        List<User> users1 = userService.queryAll();
        for (User user2 : users1) {
            System.out.println(user2);
        }*/
       User user = new User();
       user.setName("\n" +
               "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n" +
               "        \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
               "<html>\n" +
               "<head>\n" +
               "    <title>完整demo</title>\n" +
               "    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>\n" +
               "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"ueditor.config.js\"></script>\n" +
               "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"ueditor.all.min.js\"> </script>\n" +
               "    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->\n" +
               "    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->\n" +
               "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"lang/zh-cn/zh-cn.js\"></script>\n" +
               "\n" +
               "    <style type=\"text/css\">\n" +
               "        div{\n" +
               "            width:100%;\n" +
               "        }\n" +
               "    </style>\n" +
               "</head>\n" +
               "<body>\n" +
               "<div>\n" +
               "    <h1>完整demo</h1>\n" +
               "    <script id=\"editor\" type=\"text/plain\" style=\"width:1024px;height:500px;\"></script>\n" +
               "</div>\n" +
               "<div id=\"btns\">\n" +
               "    <div>\n" +
               "        <button onclick=\"getAllHtml()\">获得整个html的内容</button>\n" +
               "        <button onclick=\"getContent()\">获得内容</button>\n" +
               "        <button onclick=\"setContent()\">写入内容</button>\n" +
               "        <button onclick=\"setContent(true)\">追加内容</button>\n" +
               "        <button onclick=\"getContentTxt()\">获得纯文本</button>\n" +
               "        <button onclick=\"getPlainTxt()\">获得带格式的纯文本</button>\n" +
               "        <button onclick=\"hasContent()\">判断是否有内容</button>\n" +
               "        <button onclick=\"setFocus()\">使编辑器获得焦点</button>\n" +
               "        <button onmousedown=\"isFocus(event)\">编辑器是否获得焦点</button>\n" +
               "        <button onmousedown=\"setblur(event)\" >编辑器失去焦点</button>\n" +
               "\n" +
               "    </div>\n" +
               "    <div>\n" +
               "        <button onclick=\"getText()\">获得当前选中的文本</button>\n" +
               "        <button onclick=\"insertHtml()\">插入给定的内容</button>\n" +
               "        <button id=\"enable\" onclick=\"setEnabled()\">可以编辑</button>\n" +
               "        <button onclick=\"setDisabled()\">不可编辑</button>\n" +
               "        <button onclick=\" UE.getEditor('editor').setHide()\">隐藏编辑器</button>\n" +
               "        <button onclick=\" UE.getEditor('editor').setShow()\">显示编辑器</button>\n" +
               "        <button onclick=\" UE.getEditor('editor').setHeight(300)\">设置高度为300默认关闭了自动长高</button>\n" +
               "    </div>\n" +
               "\n" +
               "    <div>\n" +
               "        <button onclick=\"getLocalData()\" >获取草稿箱内容</button>\n" +
               "        <button onclick=\"clearLocalData()\" >清空草稿箱</button>\n" +
               "    </div>\n" +
               "\n" +
               "</div>\n" +
               "<div>\n" +
               "    <button onclick=\"createEditor()\">\n" +
               "    创建编辑器</button>\n" +
               "    <button onclick=\"deleteEditor()\">\n" +
               "    删除编辑器</button>\n" +
               "</div>\n" +
               "\n" +
               "<script type=\"text/javascript\">\n" +
               "\n" +
               "    //实例化编辑器\n" +
               "    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例\n" +
               "    var ue = UE.getEditor('editor');\n" +
               "\n" +
               "\n" +
               "    function isFocus(e){\n" +
               "        alert(UE.getEditor('editor').isFocus());\n" +
               "        UE.dom.domUtils.preventDefault(e)\n" +
               "    }\n" +
               "    function setblur(e){\n" +
               "        UE.getEditor('editor').blur();\n" +
               "        UE.dom.domUtils.preventDefault(e)\n" +
               "    }\n" +
               "    function insertHtml() {\n" +
               "        var value = prompt('插入html代码', '');\n" +
               "        UE.getEditor('editor').execCommand('insertHtml', value)\n" +
               "    }\n" +
               "    function createEditor() {\n" +
               "        enableBtn();\n" +
               "        UE.getEditor('editor');\n" +
               "    }\n" +
               "    function getAllHtml() {\n" +
               "        alert(UE.getEditor('editor').getAllHtml())\n" +
               "    }\n" +
               "    function getContent() {\n" +
               "        var arr = [];\n" +
               "        arr.push(\"使用editor.getContent()方法可以获得编辑器的内容\");\n" +
               "        arr.push(\"内容为：\");\n" +
               "        arr.push(UE.getEditor('editor').getContent());\n" +
               "        alert(arr.join(\"\\n\"));\n" +
               "    }\n" +
               "    function getPlainTxt() {\n" +
               "        var arr = [];\n" +
               "        arr.push(\"使用editor.getPlainTxt()方法可以获得编辑器的带格式的纯文本内容\");\n" +
               "        arr.push(\"内容为：\");\n" +
               "        arr.push(UE.getEditor('editor').getPlainTxt());\n" +
               "        alert(arr.join('\\n'))\n" +
               "    }\n" +
               "    function setContent(isAppendTo) {\n" +
               "        var arr = [];\n" +
               "        arr.push(\"使用editor.setContent('欢迎使用ueditor')方法可以设置编辑器的内容\");\n" +
               "        UE.getEditor('editor').setContent('欢迎使用ueditor', isAppendTo);\n" +
               "        alert(arr.join(\"\\n\"));\n" +
               "    }\n" +
               "    function setDisabled() {\n" +
               "        UE.getEditor('editor').setDisabled('fullscreen');\n" +
               "        disableBtn(\"enable\");\n" +
               "    }\n" +
               "\n" +
               "    function setEnabled() {\n" +
               "        UE.getEditor('editor').setEnabled();\n" +
               "        enableBtn();\n" +
               "    }\n" +
               "\n" +
               "    function getText() {\n" +
               "        //当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容\n" +
               "        var range = UE.getEditor('editor').selection.getRange();\n" +
               "        range.select();\n" +
               "        var txt = UE.getEditor('editor').selection.getText();\n" +
               "        alert(txt)\n" +
               "    }\n" +
               "\n" +
               "    function getContentTxt() {\n" +
               "        var arr = [];\n" +
               "        arr.push(\"使用editor.getContentTxt()方法可以获得编辑器的纯文本内容\");\n" +
               "        arr.push(\"编辑器的纯文本内容为：\");\n" +
               "        arr.push(UE.getEditor('editor').getContentTxt());\n" +
               "        alert(arr.join(\"\\n\"));\n" +
               "    }\n" +
               "    function hasContent() {\n" +
               "        var arr = [];\n" +
               "        arr.push(\"使用editor.hasContents()方法判断编辑器里是否有内容\");\n" +
               "        arr.push(\"判断结果为：\");\n" +
               "        arr.push(UE.getEditor('editor').hasContents());\n" +
               "        alert(arr.join(\"\\n\"));\n" +
               "    }\n" +
               "    function setFocus() {\n" +
               "        UE.getEditor('editor').focus();\n" +
               "    }\n" +
               "    function deleteEditor() {\n" +
               "        disableBtn();\n" +
               "        UE.getEditor('editor').destroy();\n" +
               "    }\n" +
               "    function disableBtn(str) {\n" +
               "        var div = document.getElementById('btns');\n" +
               "        var btns = UE.dom.domUtils.getElementsByTagName(div, \"button\");\n" +
               "        for (var i = 0, btn; btn = btns[i++];) {\n" +
               "            if (btn.id == str) {\n" +
               "                UE.dom.domUtils.removeAttributes(btn, [\"disabled\"]);\n" +
               "            } else {\n" +
               "                btn.setAttribute(\"disabled\", \"true\");\n" +
               "            }\n" +
               "        }\n" +
               "    }\n" +
               "    function enableBtn() {\n" +
               "        var div = document.getElementById('btns');\n" +
               "        var btns = UE.dom.domUtils.getElementsByTagName(div, \"button\");\n" +
               "        for (var i = 0, btn; btn = btns[i++];) {\n" +
               "            UE.dom.domUtils.removeAttributes(btn, [\"disabled\"]);\n" +
               "        }\n" +
               "    }\n" +
               "\n" +
               "    function getLocalData () {\n" +
               "        alert(UE.getEditor('editor').execCommand( \"getlocaldata\" ));\n" +
               "    }\n" +
               "\n" +
               "    function clearLocalData () {\n" +
               "        UE.getEditor('editor').execCommand( \"clearlocaldata\" );\n" +
               "        alert(\"已清空草稿箱\")\n" +
               "    }\n" +
               "</script>\n" +
               "</body>\n" +
               "</html>");
       userService.inseret(user);
        List<User> users = userDAO.queryAll();
        for (User user1 : users) {
            System.out.println(user1);
        }
    }





}
