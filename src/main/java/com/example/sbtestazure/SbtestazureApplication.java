package com.example.sbtestazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbtestazureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbtestazureApplication.class, args);
    }

    @GetMapping("/message")
    public String message() {
        return "diu";
    }

    @GetMapping("/airc")
    public String amIReallyCrazy() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                  <title>RESUME</title>
                  <style>
                    body {
                      font-family: Arial, sans-serif;
                      margin: 20px;
                    }
                    h1 {
                      text-align: center;
                    }
                    table {
                      width: 100%;
                      border-collapse: collapse;
                    }
                    th, td {
                      padding: 8px;
                      text-align: left;
                      border-bottom: 1px solid #ddd;
                    }
                  </style>
                </head>
                <body>
                  <h1>Contact Information</h1>
                  <table>
                    <tr>
                      <th>Name</th>
                      <td>Mak Chi Ho Sam (麥智豪)</td>
                    </tr>
                    <tr>
                      <th>Address</th>
                      <td>No. 48, Ha Keng Hau, Shatin, N.T., Hong Kong</td>
                    </tr>
                    <tr>
                      <th>Mobile</th>
                      <td>9286 3049</td>
                    </tr>
                    <tr>
                      <th>Email</th>
                      <td>skltfz@gmail.com</td>
                    </tr>
                  </table>
                  <h1>CAREER OBJECTIVE</h1>
                  <p>To secure a challenging position where I can effectively contribute my skills as Technical Lead who possesses competent technical skills.</p>
              
                  <h1>EDUCATION</h1>
                  <div class="section">
                      <h2>Hong Kong University of Science and Technology</h2>
                      <p>Bachelor of Computer Engineering</p>
                      <p>September 2007 - June 2010</p>
                      <h3>Final Year Project</h3>
                      <p>Grade A</p>
                      <p>September 2005 - June 2007</p>
                      <p>Semester 2, 2005 - 2006</p>
                      <p>Semester 1, 2006 - 2007</p>
                      <p>Semester 2, 2006 - 2007</p>
                  </div>
                  <div class="section">
                      <h2>Hong Kong Baptist University (College of International Education)</h2>
                      <p>Associate Degree of Computer Science</p>
                      <p>GPA: 3.25 / 4</p>
                      <h3>Remarks:</h3>
                      <ul>
                          <li>Academic Honours Dean's List</li>
                          <li>President's Honour Roll</li>
                      </ul>
                  </div>
              
                  <h1>PROFESSIONAL EXPERIENCE</h1>
                  <div class="section">
                      <h2>Technical Lead</h2>
                      <h3>NextGen Solutions Limited</h3>
                      <ul>
                          <li>Seconded to FWD as technical lead of enterprise app (CUBE Japan) which allows solicitors to manage & trace the agents activities. The role is to govern & oversee both frontend & backend development progress and meet with the expectation of the client's PO / PM (team size ~8) under the compliances of enterprise architecture.</li>
                          <li>Aligning with the UI / UX team for design requirements, provide feasibility study & estimations & development.</li>
                          <li>Aligning with the backend team for API schema & logic implementation.</li>
                      </ul>
                      <h3>Technical Lead / Application Architect</h3>
                      <h3>IBM</h3>
                      <ul>
                          <li>Seconded to HKJC as technical lead in one of the react native app team (team size ~ 10 developers, react native, redux, jenkins)</li>
                          <li>Enabling developers, following up defects & feedbacks, reviewing deliverables & managing branches and releases.</li>
                          <li>Governing the team development progress on new stories provides technical analysis and estimation.</li>
                          <li>Coordinate the expectations among developers, SAs, BA, scrum master POs, within the team.</li>
                          <li>Participated in a pre-sales / consultancy project for technical analysis & POC (HKTDC, Augmented Reality, swiftUI).</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Associate Consultant - Full Stack Engineering</h2>
                      <h3>Hong Kong Productivity Council</h3>
                      <ul>
                          <li>Lead of Po Leung Kuk HRIS system & HKAEE development (6 devs). (C#.NET, MSSQL, vuejs)</li>
                          <li>Lead of FitEasyApp development (1 dev) (react native, laravel, MySql, vue2js, python, openCV).</li>
                          <li>Maintenance of LMS projects (2 dev) (PHP, ASP, MySQL)</li>
                          <li>Setup a DevOps automation server POC integrated with test automation, code scan, SRAA & notification (Jenkins, JIRA, sonarqube)</li>
                          <li>R&D (45%), enable developers, review deliverables, task assignment & objectives assurance (35%), technical consultation, requirement analysis, estimation, tutor (20%)</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Senior System Analyst</h2>
                      <h3>Pro-Tech Technology (Asia) Ltd</h3>
                      <ul>
                          <li>Development lead, firefighting the ad-hot projects. Providing guidance of standard, technologies, tools and techniques for the team, work closely with PM / BA / business users and end-users on issues related to design and requirements</li>
                          <li>Timesheet system, Contract & Budget System, Online Application Form & Reporting System (Nan Fung, New World China, WHARF)[ K2 workflow, .NET MVC, kendo, EF6, MSSQL]</li>
                          <li>Home Care System (SHENG KUNG HUI WELFARE COUNCIL LIMITED, .net core 3.1 integrating with Azure's [key vault, App services, VM])</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Senior Analyst Programmer</h2>
                      <h3>Integrated Enterprise Solution</h3>
                      <ul>
                          <li>Support, enhance & develop for 3 projects which are government department, HKEX, and Philip Morris. (.NET, MSSQL, Network & Security tinkering on code scan and security scan (Fortify, QUALYS))</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Senior Analyst Programmer</h2>
                      <h3>Pactera</h3>
                      <ul>
                          <li>Seconded to Swire Properties for development and maintenance on the property lease system, management system & ballot system (.NET, MSSQL)</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Application Developer</h2>
                      <h3>Social Career Limited</h3>
                      <ul>
                          <li>Develop and maintain the company website UI & UX. (Angular JS, MySQL, node JS)</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Analyst Programmer</h2>
                      <h3>LazyBug Studio Limited</h3>
                      <ul>
                          <li>Develop and maintain the company's CRM, back office, cash site systems.</li>
                          <li>Implementing console program to bridge the data connection with other external systems (.NET, MSSQL, MVC, ReactJS, NodeJS)</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Senior Programmer</h2>
                      <h3>Neo Derm Group Ltd</h3>
                      <ul>
                          <li>Retrieve the user requirements of the company dashboard and import portal sites from the business analyst. Analyze them, perform feasibility studies and impact analysis.</li>
                          <li>Perform technical design, development, unit testing and development integration testing to the implementation. (.NET MSSQL)</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Analyst Programmer</h2>
                      <h3>We Software Limited</h3>
                      <ul>
                          <li>As a sole developer to maintain web instances for a global, consortium-backed operator of alternative equity trading venues (.NET DNN CMS, AWS EC2), handling any upcoming incidents include database, web change requests and reporting.</li>
                          <li>Develop an android application using native android & Phonegap, leading the development of the project. (JAVA)</li>
                          <li>Implement PHP web services, mail server, website (supporting small projects & the company's leave system) (PHP, LAMP).</li>
                      </ul>
                  </div>
                  <div class="section">
                      <h2>Programmer</h2>
                      <h3>ITOPIA LIMITED</h3>
                      <ul>
                          <li>Working with PM or taking lead for development of more than 12 full life cycle MSCRM customization projects, tasks include implementing entities, processes, plugins, workflows and external web services, SSRS reports and managing SQL data & schemas upon user request.</li>
                      </ul>
                  </div>
              
                  <h1>COMPUTER COMPETENCY</h1>
                  <div class="section">
                      <h2>Programming Language</h2>
                      <p>.NET(C#, VB, core), CSS, C, C++, HTML5, JavaScript (ES6^), Java, PHP, Python, React native, Regex, SCSS, SwiftUI, Vue, xml, YAML</p>
                  </div>
                  <div class="section">
                      <h2>Database & Development Framework</h2>
                      <p>.NET MVC, Android, Angular, Bootstrap, EF, IOS, kendo, Laravel, MSSQL, MySQL, Node.js, OpenCV, SPFX, SSRS</p>
                  </div>
                  <div class="section">
                      <h2>Cloud, CRM, CMS, DevOps, IDE</h2>
                      <p>Android studio, Apache, Azure, AWS (EC2, RDS, DynamoDB), Git, IIS, Jenkins, K8s, MSCRM, Visual Studio, VS Code, Unity, Unix, WordPress, Xcode</p>
                  </div>
              
                  <h1>LANGUAGE SKILLS</h1>
                  <div class="section">
                      <h2>Mother Tongue(s)</h2>
                      <p>Cantonese (Native)</p>
                  </div>
                  <div class="section">
                      <h2>Other Language(s)</h2>
                      <p>English (Fluent), Mandarin (Elementary), Japanese(Elementary, N5)</p>
                  </div>
              
                  <h1>ADDITIONAL INFORMATION</h1>
                  <div class="section">
                      <h2>Interest</h2>
                      <p>piano, travel, blackjack, reading, rubik cube, burr puzzle</p>
                  </div>
                  <div class="section">
                      <h2>Personal Characteristics</h2>
                      <p>adaptability, assertiveness, autonomous, diligence, efficient, enthusiastic, calm, cooperative, creative, curiosity, motivation, responsible</p>
                  </div>
              
                  <h1>REFERENCE</h1>
                  <p>Available Upon Request</p>
                </body>
                </html>""";
    }
}
