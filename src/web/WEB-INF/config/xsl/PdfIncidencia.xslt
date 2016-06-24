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
</xsl:stylesheet>
