import com.github.spotbugs.snom.Confidence
import com.github.spotbugs.snom.Effort

plugins {
  id("com.github.spotbugs")
}

spotbugs {
  effort.set(Effort.DEFAULT)
  reportLevel.set(Confidence.DEFAULT)
  showProgress.set(true)
}
