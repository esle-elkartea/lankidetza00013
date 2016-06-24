<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle del Parte de Trabajo</fo:block>
		<xsl:for-each select="./Partes">
			<fo:block space-before="6pt" space-after="6pt">
				Fecha: <xsl:value-of select="FechaPartesParsed"/>
			</fo:block>				
			<fo:block space-before="6pt" space-after="6pt">
				Referencia: <xsl:value-of select="ReferenciaPartesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Unidad de Ejecución: <xsl:value-of select="IduejecucionPartesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Operario: <xsl:value-of select="IdoperarioPartesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Máquina: <xsl:value-of select="IdmaquinariaPartesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Horas: <xsl:value-of select="HorasPartesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Importe: <xsl:value-of select="ImportePartesParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Descripción: <xsl:value-of select="DescripcionPartesParsed"/>
			</fo:block>						
			<fo:block space-before="6pt" space-after="6pt">
				Observaciones: <xsl:value-of select="ObservacionesPartesParsed"/>
			</fo:block>					
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
