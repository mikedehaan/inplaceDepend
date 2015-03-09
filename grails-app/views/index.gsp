<!DOCTYPE html>
<html>
	<head>
		<title>Plugin Dependency Test</title>
	<body>

        <g:set var="pluginTesterService" bean="pluginTesterService"/>
        <p>Plugin Results: ${pluginTesterService.serviceMethod()}</p>
	</body>
</html>
