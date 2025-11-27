//> using scala 3.7.4

package svaggy

def circle(r: Double, cx: Double, cy: Double): String =
  s"""|<circle cx="$cx" cy="$cy" r="$r" stroke="green" stroke-width="4" fill="yellow" />
      |""".stripMargin

def canvas(width: Double, height: Double)(body: String): String = 
  s"""|<svg width="$width" height="$height" xmlns="http://www.w3.org/2000/svg">
      |$body
      |</svg>
      |""".stripMargin

def example = 
  canvas(width = 200, height = 200):
    circle(r = 100, cx = 150, cy = 150)
