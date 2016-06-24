<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle del Operario</fo:block>
		<xsl:for-each select="./Operarios">
			<fo:block font-size="12px" font-weight="bold" space-after="12pt">Datos Principales</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				NIF: <xsl:value-of select="NifOperariosParsed"/>
				Referencia: <xsl:value-of select="ReferenciaOperariosParsed"/>
			</fo:block>			
			<fo:block space-before="6pt" space-after="6pt">
				Nombre Completo: <xsl:value-of select="ApellidounoOperariosParsed"/>  <xsl:value-of select="ApellidodosOperariosParsed"/>, <xsl:value-of select="NombreOperariosParsed"/> 
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Alta: <xsl:value-of select="FechaaltaOperariosParsed"/>	Fecha de Baja: <xsl:value-of select="FechabajaOperariosParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Número S.S.: <xsl:value-of select="NumerossOperariosParsed"/>
			</fo:block>			
			<fo:block space-before="6pt" space-after="6pt">
				Categoría Laboral: <xsl:value-of select="IdcategoriaOperariosParsed"/>
			</fo:block>
			<fo:block font-size="12px" font-weight="bold" space-before="12pt" space-after="12pt">Datos de Contacto</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Dirección: <xsl:value-of select="DireccionOperariosParsed"/>		CP: <xsl:value-of select="CpOperariosParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Localidad: <xsl:value-of select="IdlocalidadOperariosParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Teléfono: <xsl:value-of select="TelefonoOperariosParsed"/>
			</fo:block>							
			<fo:block space-before="6pt" space-after="6pt">
				Móvil: <xsl:value-of select="MovilOperariosParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				e-mail: <xsl:value-of select="EmailOperariosParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Coste: <xsl:value-of select="CosteOperariosParsed"/>
			</fo:block>		
			<fo:block space-before="6pt" space-after="6pt">
				Externo(Sí/No):  <xsl:value-of select="ExternoOperariosParsed2"/>
			</fo:block>	
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
