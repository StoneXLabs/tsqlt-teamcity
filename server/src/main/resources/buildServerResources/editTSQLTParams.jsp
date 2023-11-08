<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="forms" tagdir="/WEB-INF/tags/forms" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="propertiesBean" scope="request" type="jetbrains.buildServer.controllers.BasePropertiesBean"/>

<l:settingsGroup title="tSQLt Database Information">
    <tr>
        <th>
            <label for="tsqlt.server_instance">Database Server: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="tsqlt.server_instance" className="longField" />
            <span class="error" id="error_tsqlt.server_instance"></span>
            <span class="smallNote">Database Server. You can specify the instance name with the syntax Server\Instance, ej. (local)\SQLEXPRESS, additionally you can specify a port using Server:Port</span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="tsqlt.database">Database name: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="tsqlt.database" className="longField" />
            <span class="error" id="error_tsqlt.database"></span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="tsqlt.tests">Tests to run: </label>
        </th>
        <td>
            <props:textProperty name="tsqlt.tests" className="longField" />
            <span class="smallNote">For running specific tests. Leave empty to run all tests.</span>
            <span class="smallNote">Enter either TestClass or TestClass.TestName</span>
        </td>
    </tr>
</l:settingsGroup>
