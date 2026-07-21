import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {

  return (

    <div>

      <h1>Cognizant Academy Dashboard</h1>

      <CohortDetails
        title="React Training"
        startDate="10-Jul-2026"
        status="ongoing"
        coach="Rahul"
        trainer="Anil"
      />

      <CohortDetails
        title="Java Full Stack"
        startDate="15-Jun-2026"
        status="completed"
        coach="Kiran"
        trainer="Priya"
      />

      <CohortDetails
        title="Python"
        startDate="01-Aug-2026"
        status="ongoing"
        coach="Ravi"
        trainer="Deepa"
      />

    </div>

  );

}

export default App;