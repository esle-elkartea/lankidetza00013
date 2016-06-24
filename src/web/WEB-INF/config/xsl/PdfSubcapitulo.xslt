<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="2cm" margin-left="2.5cm" margin-right="2.5cm">
					<fo:region-body margin-top="3cm" column-count="1"/>
					<fo:region-before extent="3cm"/>
					<fo:region-after region-name="footer-main" extent="1.5cm"/>
				</fo:simple-page-master>
			</fo:layout-master-set>
			<fo:page-sequence master-reference="simple">
				<fo:static-content flow-name="footer-main">
					<fo:block text-align="center" font-size="12px">- <fo:page-number/> -
					</fo:block>
				</fo:static-content>
				<fo:flow flow-name="xsl-region-body">
					<xsl:apply-templates select="result"/>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
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
</xsl:stylesheet>
