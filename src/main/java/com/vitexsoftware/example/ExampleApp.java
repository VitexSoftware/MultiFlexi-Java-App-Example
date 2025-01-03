/**
 * This file is part of the The following has evaluated to null or missing:
==> project.name  [in template "Templates/Licenses/license-default.txt" at line 3, column 31]

----
Tip: It's the step after the last dot that caused this error, not those before it.
----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${project.name}  [in template "Templates/Licenses/license-default.txt" at line 3, column 29]
	- Reached through: #include "${project.licensePath}"  [in template "Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java" at line 4, column 1]
---- package
 *
 * https://github.com/VitexSoftware/
 *
 * (c) Vítězslav Dvořák <http://vitexsoftware.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */


package com.vitexsoftware.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Vítězslav Dvořák <info@vitexsoftware.cz>
 */
public class ExampleApp {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

        String version = dotenv.get("MULTIFLEXI_VERSION", System.getenv("MULTIFLEXI_VERSION"));
        String companyId = dotenv.get("MULTIFLEXI_COMPANY_ID", System.getenv("MULTIFLEXI_COMPANY_ID"));
        String runTemplateId = dotenv.get("MULTIFLEXI_RUNTEMPLATE_ID", System.getenv("MULTIFLEXI_RUNTEMPLATE_ID"));
        String applicationUuid = dotenv.get("MULTIFLEXI_APPLICATION_UUID", System.getenv("MULTIFLEXI_APPLICATION_UUID"));
        String applicationId = dotenv.get("MULTIFLEXI_APPLICATION_ID", System.getenv("MULTIFLEXI_APPLICATION_ID"));
        String jobId = dotenv.get("MULTIFLEXI_JOB_ID", System.getenv("MULTIFLEXI_JOB_ID"));
        String companyName = dotenv.get("MULTIFLEXI_COMPANY_NAME", System.getenv("MULTIFLEXI_COMPANY_NAME"));
        String executor = dotenv.get("MULTIFLEXI_EXECUTOR", System.getenv("MULTIFLEXI_EXECUTOR"));
        String applicationName = dotenv.get("MULTIFLEXI_APPLICATION_NAME", System.getenv("MULTIFLEXI_APPLICATION_NAME"));
        String runTemplateName = dotenv.get("MULTIFLEXI_RUNTEMPLATE_NAME", System.getenv("MULTIFLEXI_RUNTEMPLATE_NAME"));
        String companyCode = dotenv.get("MULTIFLEXI_COMPANY_CODE", System.getenv("MULTIFLEXI_COMPANY_CODE"));
        String easeLogger = dotenv.get("EASE_LOGGER", System.getenv("EASE_LOGGER"));
        String resultFile = dotenv.get("RESULT_FILE", System.getenv("RESULT_FILE"));

        JSONObject json = new JSONObject();
        json.put("MULTIFLEXI_VERSION", version);
        json.put("MULTIFLEXI_COMPANY_ID", companyId);
        json.put("MULTIFLEXI_RUNTEMPLATE_ID", runTemplateId);
        json.put("MULTIFLEXI_APPLICATION_UUID", applicationUuid);
        json.put("MULTIFLEXI_APPLICATION_ID", applicationId);
        json.put("MULTIFLEXI_JOB_ID", jobId);
        json.put("MULTIFLEXI_COMPANY_NAME", companyName);
        json.put("MULTIFLEXI_EXECUTOR", executor);
        json.put("MULTIFLEXI_APPLICATION_NAME", applicationName);
        json.put("MULTIFLEXI_RUNTEMPLATE_NAME", runTemplateName);
        json.put("MULTIFLEXI_COMPANY_CODE", companyCode);
        json.put("EASE_LOGGER", easeLogger);

        if (resultFile != null && !resultFile.isEmpty()) {
            try (FileWriter file = new FileWriter(resultFile)) {
                file.write(json.toString(4)); // Pretty print with an indent of 4 spaces
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(json.toString(4)); // Pretty print with an indent of 4 spaces
        }
    }
}
