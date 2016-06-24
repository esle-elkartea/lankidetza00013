<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle de la Incidencia</fo:block>
		<xsl:for-each select="./Incidencias">
			<fo:block space-before="6pt" space-after="6pt">
				Fecha: <xsl:value-of select="FechaIncidenciasParsed"/>
			</fo:block>				
			<fo:block space-before="6pt" space-after="6pt">
				Referencia: <xsl:value-of select="ReferenciaIncidenciasParsed"/>
			</fo:block>
			<fo:block>
				Unidad de Ejecución: <xsl:value-of select="IduejecucionIncidenciasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Tipo de Incidencia: <xsl:value-of select="IdtipoincidenciaIncidenciasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Operario: <xsl:value-of select="IdoperarioIncidenciasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Máquina: <xsl:value-of select="IdmaquinariaIncidenciasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Horas: <xsl:value-of select="HorasIncidenciasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Descripción: <xsl:value-of select="DescripcionIncidenciasParsed"/>
			</fo:block>						
			<fo:block space-before="6pt" space-after="6pt">
				Observaciones: <xsl:value-of select="ObservacionesIncidenciasParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Importe: <xsl:value-of select="ImporteIncidenciasParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Kilómetros: <xsl:value-of select="KilometrosIncidenciasParsed"/>
			</fo:block>						
			<fo:block space-before="6pt" space-after="6pt">
				Tonelaje: <xsl:value-of select="TonelajeIncidenciasParsed"/>
			</fo:block>				
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
