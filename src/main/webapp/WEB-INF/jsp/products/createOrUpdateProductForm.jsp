<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="products">
    
    <form:form modelAttribute="product" class="form-horizontal" id="add-prouct-form">
        
            <petclinic:inputField label="Name" name="name"/>
            <petclinic:inputField label="Price" name="price"/>
            <div>
            <petclinic:selectField label="Product Type" name="productType" names = "${productTypes}" size = "3"/>
            </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                
                    
                        <button class="btn btn-default" type="submit">Add Owner</button>
                    
                    
                        <button class="btn btn-default" type="submit">Update Owner</button>
                    
                
            </div>
        </div>
    </form:form>
</petclinic:layout>