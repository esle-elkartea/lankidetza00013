<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle del Subcapítulo</fo:block>
		<xsl:for-each select="./Subcapitulos">
			<fo:block space-before="12pt" space-after="12pt">
				Código: <xsl:value-of select="Idsubcapitulo"/>
			</fo:block>																		
			<fo:block space-before="12pt" space-after="12pt">
				Capítulo: <xsl:value-of select="IdcapituloSubcapitulosParsed"/>
			</fo:block>																		
			<fo:block space-before="12pt" space-after="12pt">
				Nombre: <xsl:value-of select="NombreSubcapitulosParsed"/>
			</fo:block>
			<fo:block space-before="12pt" space-after="12pt">
				Referencia: <xsl:value-of select="ReferenciaSubcapitulosParsed"/>
			</fo:block>																		
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
