/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package acceptance.uk.gov.hmrc.apidocumentation.specs

import acceptance.uk.gov.hmrc.apidocumentation.TestSpec
import org.scalatest._
import utils.uk.gov.hmrc.apidocumentation.mocks.DescriptiveMocks

trait ComponentTestsSpec extends GivenWhenThen { ts: TestSpec =>

  object Given extends DescriptiveMocks {
    override def condition(message: String) {
      Given(message:String)
    }
  }

  object When extends DescriptiveMocks {
    override def condition(message: String) {
      When(message: String)
    }
  }

  object And extends DescriptiveMocks {
    override def condition(message: String) {
      And(message: String)
    }
  }

  override def beforeEach() = {
    ts.webDriver.manage().deleteAllCookies()
  }

}


