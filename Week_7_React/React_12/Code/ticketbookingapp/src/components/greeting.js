import GuestGreeting from './guestpage';
import UserGreeting from './userpage';

function Greeting({ isLoggedIn }) {
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

export default Greeting;