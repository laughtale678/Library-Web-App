import ReactDOM from 'react-dom/client';
import './index.css';
import {App} from './App';
import {BrowserRouter} from 'react-router-dom';
import { loadStripe } from '@stripe/stripe-js';
import { Elements } from '@stripe/react-stripe-js';


const stripePromise = loadStripe('pk_test_51Q6hsLLE6PU7SUwaFxBY2yH4H4WvdSrcGLW5l1W8BhmWDjDTa6CzqCCLId0EhSeHXtntqTYqF0EpMemM79POJ0w900iMgAKUgu');


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <BrowserRouter>
    <Elements stripe={stripePromise}>
      <App />
    </Elements>
  </BrowserRouter>
);

