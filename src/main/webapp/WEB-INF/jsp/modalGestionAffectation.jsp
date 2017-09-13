<%--

    Copyright © 2017 GIP-RECIA (https://www.recia.fr/)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<!-- MODAL gestion des affectations ressources-->
<div class="modal affectations">
    <div class="modal-content">
        <div class="modal-header">
            <h4 class="modal-title"><spring:message code="site.affectation.titre" /><i class="mdi mdi-close withripple"></i></h4>
        </div>
        <div class="modal-body">
           	<c:forEach var="gestionAffectation" items="${affectation}" >
	            <div class="website">
	                <a href="<spring:message code="${gestionAffectation.lien}" />" title="<spring:message code="site.affectation.titre" />" target="_blank">
	                    <div class="website-name"><spring:message code="${gestionAffectation.nom}" /><i class="mdi mdi-24px mdi-launch"></i></div>
	                    <div class="website-description"><spring:message code="${gestionAffectation.description}" /></div>
	                </a>
	            </div>
			</c:forEach>
            
        </div>
        <div class="modal-footer">
            <a class="btn btn-primary"><spring:message code="site.affectation.fermer" /></a>
        </div>
    </div>
</div>
<div class="overlay"></div>
